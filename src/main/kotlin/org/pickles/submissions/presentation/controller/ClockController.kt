package org.pickles.submissions.presentation.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ClockController {

    @GetMapping
    fun index(model: Model): String {
        model.addAttribute("backgroundImage", getImageURL())
        return "index"
    }

    private fun getImageURL(): String {
        // 本来はここで出す画像を選択するのだけど、めんどくさいのでランダムで画像が取れるURLを固定で返す
        // TODO: いい感じにランダムで画像URLが帰るような実装にする
        return "https://picsum.photos/1920/1080"
    }
}