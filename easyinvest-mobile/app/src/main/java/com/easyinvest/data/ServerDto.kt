package com.easyinvest.data

import java.util.*

data class PortfolioDto(
    val totalMoney: Float,
    val startMoney: Float,
    val freeMoney: Float,

    val subscription: List<SubscriptionDto>
)

data class SubscriptionDto(
    val userFollowedId: String,
    val moneyAllocated: Float,
    val totalMoney: Float,
    val trader: TraderDto
)

data class TraderDto(
    val id: String,
    val name: String,
    val isFollowed: Boolean,
    val monthGrowth: Float,
    val followersCount: Int,
    val dataBalances: List<DataBalanceDto>,
    val subscriptionId: String?
)

data class DataBalanceDto(
    val date: Date,
    val balance: Float
)