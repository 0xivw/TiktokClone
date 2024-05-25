package com.x.data.repository.home

import com.x.data.model.VideoModel
import com.x.data.source.VideoDataSource.fetchVideos
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ForYouRepository @Inject constructor() {
    fun getForYouPageFeeds(): Flow<List<VideoModel>> {
        return fetchVideos()
    }

}