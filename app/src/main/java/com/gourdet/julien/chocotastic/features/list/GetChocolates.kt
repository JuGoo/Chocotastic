package com.gourdet.julien.chocotastic.features.list

import com.gourdet.julien.chocotastic.framework.executor.ExecutionScheduler
import com.gourdet.julien.chocotastic.framework.interactor.UseCase
import io.reactivex.Single
import javax.inject.Inject

/**
 * Created by Julien on 16/03/2018.
 */

class GetChocolates
@Inject constructor(private val chocolatesRepository: ChocolatesRepository,
                    private val scheduler: ExecutionScheduler) : UseCase.RxSingle<List<Chocolate>, UseCase.None>() {

    override fun build(params: None?): Single<List<Chocolate>> =
            chocolatesRepository.chocolates().compose(scheduler.highPrioritySingle())
}