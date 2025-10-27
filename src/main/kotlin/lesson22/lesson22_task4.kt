package org.example.lesson22

class MainScreenViewModel(var mainScreenState: MainScreenState) {

    fun loadData() {
        println("data ls loading...")
        mainScreenState = mainScreenState.copy(isLoading = true)
    }

    data class MainScreenState(val data: String, var isLoading: Boolean = false)

    override fun toString() = "MainScreenViewModel, state = $mainScreenState"
}

fun main() {
    val viewModel = MainScreenViewModel(MainScreenViewModel.MainScreenState("отсутствие данных"))
    println(viewModel)
    viewModel.loadData()
    println(viewModel)
    viewModel.mainScreenState = MainScreenViewModel.MainScreenState("загрузка данных")
    viewModel.loadData()
    viewModel.mainScreenState = MainScreenViewModel.MainScreenState("наличие загруженных данных")
    viewModel.loadData()
    println(viewModel)
}