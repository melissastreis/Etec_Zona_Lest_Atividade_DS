const CACHE_NAME = "FloriculuraCache";
const CACHE_ASSETS = [
    "icons/app-icon-192x192.png",
    "icons/app-icon-512x512.png",
    "index.html",
    "manifest.json",
    "script.js",
    "style.css",
    "sw.js",
    "imagens/rosas.png",
    "imagens/girassois.png",
    "imagens/tulipas.png",
    "imagens/lirios.png",
    "imagens/orquideas.png",
    "imagens/gerberas.png",
    "contato.html",
    "flores.html",
    "menu.js"
];

self.addEventListener("install", () => {
    caches.open("FloriculturaCache").then((cache) => {
        cache.addAll(CACHE_ASSETS);
    });
});

self.addEventListener("fetch", (event) => {
    event.respondWith(
        caches.match(event.request).then((response) => {
            return response || fetch(event.request);
        })
    );
});