package br.com.cantinho.android_mvvm_clean_architecture.ui.calculator.usecases

import br.com.cantinho.android_mvvm_clean_architecture.ui.calculator.OperationResult
import br.com.cantinho.android_mvvm_clean_architecture.ui.calculator.Success

class SumUseCase {

    fun performSum(paramA: Int, paramB: Int): OperationResult {
        return Success( paramA + paramB )
    }

}