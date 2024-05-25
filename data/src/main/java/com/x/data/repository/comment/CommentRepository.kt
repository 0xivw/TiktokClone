package com.x.data.repository.comment

import com.x.data.model.CommentList
import com.x.data.source.CommentDataSource.fetchComment
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CommentRepository @Inject constructor(){
    fun getComment(videoId: String): Flow<CommentList> {
        return fetchComment(videoId)
    }
}