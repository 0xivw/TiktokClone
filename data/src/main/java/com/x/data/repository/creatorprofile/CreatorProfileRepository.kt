package com.x.data.repository.creatorprofile

import com.x.data.model.UserModel
import com.x.data.model.VideoModel
import com.x.data.source.UsersDataSource.fetchSpecificUser
import com.x.data.source.VideoDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CreatorProfileRepository @Inject constructor() {
    fun getCreatorDetails(id: Long): Flow<UserModel?> {
        return fetchSpecificUser(id)
    }

    fun getCreatorPublicVideo(id: Long): Flow<List<VideoModel>> {
        return VideoDataSource.fetchVideosOfParticularUser(id)
    }

}