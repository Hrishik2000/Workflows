package com.example.healthapp;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HealthController {
    @GetMapping(value = "/health", produces = MediaType.TEXT_HTML_VALUE)
    @ResponseBody
    public String health() {
        return """
            <!doctype html>
            <html lang="en"><head><meta charset="utf-8"><meta name="viewport" content="width=device-width, initial-scale=1">
            <title>Health</title><style>body{font-family:system-ui;background:#0f172a;color:#e2e8f0;display:grid;place-items:center;min-height:100vh;margin:0}.card{padding:3rem 4rem;background:#1e293b;border-radius:20px;text-align:center;box-shadow:0 20px 60px #0004}h1{color:#4ade80;font-size:3rem;margin:.4rem 0}p{color:#94a3b8}</style></head>
            <body><main class="card"><div style="font-size:3rem">&#10003;</div><h1>Healthy</h1><p>Java app is running</p></main></body></html>
            """;
    }

    @GetMapping("/")
    public String home() { return "redirect:/health"; }
}
