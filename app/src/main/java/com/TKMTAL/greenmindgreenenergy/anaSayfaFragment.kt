package com.TKMTAL.greenmindgreenenergy

import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.VideoView
import androidx.fragment.app.Fragment

class anaSayfaFragment : Fragment() {

    private lateinit var videoView: VideoView
    private var mediaPlayer: MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ana_sayfa, container, false)
        videoView = view.findViewById(R.id.videoPlayerView)
        setupVideoPlayer()
        return view
    }

    private fun setupVideoPlayer() {
        val videoUri = Uri.parse("android.resource://${requireContext().packageName}/raw/proje_tanitim_video")
        videoView.setVideoURI(videoUri)

        videoView.setOnPreparedListener { mp ->
            mp.isLooping = true
            videoView.start()
        }

        videoView.setOnErrorListener { _, what, extra ->
            Log.e("VideoError", "Hata kodu: $what, Ekstra: $extra")
            true
        }
    }


    override fun onPause() {
        super.onPause()
        mediaPlayer?.pause()
    }

    override fun onResume() {
        super.onResume()
        mediaPlayer?.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer?.release()
        mediaPlayer = null
    }
}
