    fun main() {
        //создание графа
        val graph = Graph()

        //создаие вершин
        println("Enter the vertex name or enter end to stop addition: ")
        while (true) {
            val name: String? = readLine()
            when(name) {
                "end" -> break
                "" -> continue
            }
            graph.addVertex(name!!)
        }

        //создание ребер
        println("Add connection or enter  end to stop addition:" +
                "\n Example: a z")
        while (true) {
            val (first, second) = readLine()!!.split(" ")
            if (first == "end" || second == "end") break
            graph.connect(first, second)
            println("$first and $second is edge ")
        }

        //вывод соседних вершин по отношению к одной вершине
        println("Show neighbors or enter end to stop:")
        while (true) {
            val vertex = readLine()
            if (vertex == "end") break
            println("Neighbors of $vertex is ${graph.neighbors(vertex!!)}")
        }

        //вывод остовного дерева
        graph.spanningTree()
    }