package com.x.data.repository.home

import com.x.data.model.ContentCreatorFollowingModel
import com.x.data.source.ContentCreatorForFollowingDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class FollowingRepository @Inject constructor(){
    fun getContentCreatorForFollowing(): Flow<List<ContentCreatorFollowingModel>> {
        return ContentCreatorForFollowingDataSource.fetchContentCreatorForFollowing()
    }
}