//Класс, объекты оторого будут являться графами
class Graph {

    //Вложенный класс, объекты которого будут являться вершинами
    private data class Vertex(val name: String) {

        //множество, в которо входят все соседние вершины по отношению к одной вершине
        val neighbors = mutableSetOf<Vertex>()
    }

    //множество всех вершин графа
    private val vertices = mutableMapOf<String, Vertex>()

    //функция создания вершин
    fun addVertex(name: String) {
        vertices[name] = Vertex(name)
    }

    private var number = 1
    private var name = "y$number"
    private val edSet: MutableSet<List<Vertex>> = mutableSetOf()

    //функция создающая ребра  устнавливающая связи между ними

    private fun connect(first: Vertex, second: Vertex) {
        first.neighbors.add(second)
        second.neighbors.add(first)
        for (x in vertices) {
            for (y in x.value.neighbors) {
                if (edSet.contains(listOf(x.value, y).sortedBy { it.name })) continue
                else edSet.add(listOf(x.value, y).sortedBy { it.name })
                name = "y${number++}"
                addEdge(name, x.value, y)
            }
        }
        println(edges.values.last())

        for (x in edges.values) {
            for (y in edges.values) {
                if (x.x1 == y.x1 && x.x2 == y.x2) continue
                when(x.x1) {
                    y.x1 -> connectEdges(x, y)
                    y.x2 -> connectEdges(x, y)
                }
                when(x.x2) {
                    y.x1 -> connectEdges(x, y)
                    y.x2 -> connectEdges(x, y)
                }
            }
        }
    }

    //функция передающая агументы приватной фнкции connect
    fun connect(first: String, second: String) = connect(vertices[first]!!, vertices[second]!!)

    //функция показывающая соседние вершины по отношению к одной вершине
    fun neighbors(name: String) = vertices[name]?.neighbors?.map { it.name } ?: listOf()

    //реберный класс
    private data class Edge(val name: String, val x1: Vertex, val x2: Vertex) {
        var weight: Int = 0
        val neighbors = mutableSetOf<Edge>()
    }

    //множество всех ребер графа
    private val edges: MutableMap<String, Edge> = mutableMapOf()

    //функция созания ребер
    private fun addEdge(name: String, x1: Vertex, x2: Vertex) {
        edges[name] = Edge(name, x1, x2)
    }

    //функция создающая сязи между ребрами
    private fun connectEdges(edge1: Edge, edge2: Edge) {
        edge1.neighbors.add(edge2)
        edge2.neighbors.add(edge1)
    }

    //вывод остовного дерева
    fun spanningTree() {
        println("Enter the weight of each edge:")
        for ((key, value) in edges) {
            println("\n weight of the edge $key = ")
            value.weight = readLine()?.toInt()?: {
                println("The input isn't correct")
                10
            }.toString().toInt()
        }
        println("Each edge has a weight ")

        val minWeight = edges.map { it.value }.minByOrNull { it.weight }!!
        val spanningTree = mutableListOf<Graph.Edge>(minWeight)
        var buffer1: List<List<Graph.Edge>>
        val buffer3 = mutableSetOf<Graph.Vertex>()
        try {
            for (x in 0 .. spanningTree.size + 5) {
                buffer1 = spanningTree.map { it.neighbors }.map { it.map { it } }
                val buffer2 = mutableSetOf<Graph.Edge>()
                buffer1.map { buffer2.addAll(it) }
                buffer3.addAll(spanningTree.map { it.x1 })
                buffer3.addAll(spanningTree.map { it.x2 })
                spanningTree.add(buffer2.filter {
                    !(spanningTree.contains(it)) && !(buffer3.contains(it.x1) && buffer3.contains(it.x2))
                }.sortedBy { it.weight }.first())
            }
        } catch (Null : NoSuchElementException) {
            println("Spanning Tree is ${spanningTree.size} " +
            "edges = ${spanningTree.fold(0) {initial, weight -> initial + weight.weight}}")
            spanningTree.forEach { println(it) }
        }
    }


}
