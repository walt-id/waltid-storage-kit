package id.walt.storagekit.common.model.encryptedsearch

import kotlinx.serialization.Serializable

@Serializable
data class SearchDocumentRes(
    val results: List<String>
)
