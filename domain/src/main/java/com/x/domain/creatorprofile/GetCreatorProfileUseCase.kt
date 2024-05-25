package com.x.domain.creatorprofile

import com.x.data.model.UserModel
import com.x.data.repository.creatorprofile.CreatorProfileRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetCreatorProfileUseCase @Inject constructor(
    private val creatorProfileRepository: CreatorProfileRepository
) {
    operator fun invoke(id: Long): Flow<UserModel?> {
        return creatorProfileRepository.getCreatorDetails(id)
    }
}