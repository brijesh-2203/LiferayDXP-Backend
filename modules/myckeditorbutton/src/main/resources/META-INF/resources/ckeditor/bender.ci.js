﻿var config=require("./bender");config.startBrowser=process.env.BROWSER||"Chrome";config.isTravis=!0;config.startBrowserOptions={Chrome:"--headless --disable-gpu",Firefox:"-headless"};module.exports=config;