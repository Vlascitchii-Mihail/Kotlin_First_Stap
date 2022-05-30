//Класс, объекты оторого будут являться графами
class GraphIndependentSet {

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

    private fun connect(first: Vertex, second: Vertex) {
        first.neighbors.add(second)
        second.neighbors.add(first)
    }

    //функция передающая агументы приватной фнкции connect
    fun connect(first: String, second: String) = connect(vertices[first]!!, vertices[second]!!)

    //функция показывающая соседние вершины по отношению к одной вершине
    fun neighbors(name: String) = vertices[name]?.neighbors?.map { it.name } ?: listOf()

    //нахождение наибольшего независимого множества
    fun largestIndependentSet() {
        val power = mutableListOf<GraphIndependentSet.Vertex>()
        var vert = vertices.values.first()
        while (vertices.isNotEmpty()) {
            var size = 100
            for (element in vertices.values.toList()) {
                if (element.neighbors.size < size) {
                    size = element.neighbors.size
                    vert = element
                }
            }
            power.add(vert)
            deleteVertex(vert)
        }
        println("Largest independence set is: $power")
    }

    private fun deleteVertex(vertex: GraphIndependentSet.Vertex) {
        val neighbors1 = vertex.neighbors
        for (x in neighbors1.shuffled()) {
            val neighbors2 = x.neighbors
            for (y in neighbors2) {
                y.neighbors.remove(x)
            }
            vertices.remove(x.name)
        }
        vertices.remove(vertex.name)
    }
}