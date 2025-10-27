package org.example.lesson22

class MainScreenViewModel() {

    var mainScreenState: MainScreenState = MainScreenState("отсутствие данных")

    fun loadData() {
        println("Начата загрузка данных...")
        mainScreenState = mainScreenState.copy(data = "загрузка данных", isLoading = true)
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(data = "наличие загруженных данных", isLoading = true)
        println(mainScreenState)
        mainScreenState = mainScreenState.copy(isLoading = false)
    }

    data class MainScreenState(val data: String, var isLoading: Boolean = false)

    override fun toString() = "MainScreenViewModel, state = $mainScreenState"
}

fun main() {
    val viewModel = MainScreenViewModel()
    println(viewModel)

    viewModel.loadData()

    println(viewModel)
}