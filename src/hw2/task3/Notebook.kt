package hw2.task3

class Notebook(
        var price: Int,
        var isNew: Boolean,
) {
    var model: String = ""
        private set
    var weight: Double = 0.0
        private set
    var screenDiagonal: Double = 0.0
        private set
    var processorType: ProcessorType? = null
        private set
    var graphicCard: GraphicCard? = null
        private set
    constructor(price: Int, weight: Double, processorType: ProcessorType, graphicCard: GraphicCard): this(0, false){
        this.price = price
        this.weight = weight
        this.processorType = processorType
        this.graphicCard = graphicCard
    }
    constructor(model:String ,price: Int): this(0,false){
        this.model = model
        this.price = price
    }
    fun discountPrice(percent: Int): Int{
        var p: Int = (price*(100-percent))/100
        if(p%1000>500){
            p /= 1000
            p = (p+1)*1000
        }else{
            p /= 1000
            p *= 1000
        }
        return p
    }

    override fun toString(): String {
        return "Notebook(price=$price, isNew=$isNew, model='$model', weight=$weight, screenDiagonal=$screenDiagonal, processorType=$processorType, graphicCard=${graphicCard?.model})"
    }

}

enum class ProcessorType{
    Intel, AMD, Apple
}

sealed class GraphicCard(val model: String){
    class Nvidia: GraphicCard("GeForce RTX 3090")
    class Radeon: GraphicCard("RX 6900 XT")
    class InternalIntel: GraphicCard("Intel UHD Graphics")
    class InternalAmd: GraphicCard("AMD Vega 8")
    class InternalApple: GraphicCard("Apple M1 7-Core GPU")
}

fun main(){
    val laptop = Notebook(344200, 2.1, ProcessorType.AMD, GraphicCard.Nvidia())
    println(laptop.toString())
    println("Discount price: ${laptop.discountPrice(16)}")
}