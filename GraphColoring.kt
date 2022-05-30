    class GraphColoring {

        //Вложенный класс, объекты которого будут являться вершинами
        private data class Vertex(val name: String) {

            //множество, в которо входят все соседние вершины по отношению к одной вершине
            val neighbors = mutableSetOf<Vertex>()
            var color: String = ""
        }

        //множество всех вершин графа
        private val vertices = mutableMapOf<String, Vertex>()

        //функция создания вершин
        fun addVertex(name: String) {
            vertices[name] = Vertex(name)
        }

        //функция создающая ребра  устнавливающая связи между ними

        private fun connect(first: Vertex, second: Vertex) {
            first.neighbors.add(second)
            second.neighbors.add(first)
        }

        //функция передающая агументы приватной фнкции connect
        fun connect(first: String, second: String) = connect(vertices[first]!!, vertices[second]!!)

        //функция показывающая соседние вершины по отношению к одной вершине
        fun neighbors(name: String) = vertices[name]?.neighbors?.map { it.name } ?: listOf()

        //функция выводящая хроматическое число
        fun coloring() {
            val colors = mutableListOf("Red", "Yellow", "Green", "Black", "White", "Purple")
            val colorSet: MutableSet<String> = mutableSetOf()
            for ((key, value) in vertices) {
                for (color in colors) {
                    if (value.neighbors.map { it.color }.contains(color)) continue
                    value.color = color
                    colorSet.add(color)
                    break
                }
            }
            println("Coloring of graph is ${colorSet.size}")
        }
    }