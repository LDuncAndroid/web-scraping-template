package com.lduncanandroid.kotlin.webscrapingtemplate

import it.skrape.fetcher.HttpFetcher
import it.skrape.fetcher.response
import it.skrape.fetcher.skrape

fun main() {
    // TODO
    skrape(HttpFetcher) { // <-- pass any Fetcher, e.g. HttpFetcher, BrowserFetcher, ...
        request {
            // ... request options goes here, e.g the most basic would be url
        }
        response {
            // do stuff with the response like parsing the response body ...
        }
    }
}
