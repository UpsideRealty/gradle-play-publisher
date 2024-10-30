package com.github.triplet.gradle.play.tasks.internal

import com.github.triplet.gradle.androidpublisher.PlayPublisher
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.mockito.Mockito.mock
import org.mockito.Mockito.mockStatic
import org.mockito.Mockito.`when`
import java.util.*

class PlayApiServiceTest{
    @Test
    fun `creates correct PlayPublisher type based on configured credentials`() {
        val serviceLoaderMock = mockStatic(ServiceLoader::class.java)
        val factoryMock = mock(PlayPublisher.Factory::class.java)

        `when`(serviceLoaderMock.load(PlayPublisher.Factory::class.java)).thenReturn(factoryMock)
    }
}
