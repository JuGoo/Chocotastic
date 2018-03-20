package com.gourdet.julien.chocotastic.features.list

import com.gourdet.julien.chocotastic.framework.interactor.UseCase
import com.gourdet.julien.chocotastic.framework.interactor.UseCase.None
import javax.inject.Inject

/**
 * Created by Julien on 16/03/2018.
 */

class GetChocolates
@Inject constructor(private val chocolatesRepository: ChocolatesRepository) : UseCase<List<Chocolate>, None>() {

    override suspend fun run(params: None) = chocolatesRepository.chocolates()
}