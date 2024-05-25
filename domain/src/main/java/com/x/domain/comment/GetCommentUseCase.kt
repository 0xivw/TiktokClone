package com.x.domain.comment

import com.x.data.model.CommentList
import com.x.data.repository.comment.CommentRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCommentUseCase @Inject constructor(
    private val commentRepository: CommentRepository
){
    operator fun invoke(videoId: String): Flow<CommentList> {
        return commentRepository.getComment(videoId)
    }
}