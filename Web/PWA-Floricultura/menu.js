const menu = document.getElementById("menu");
const navlinks = document.getElementById("nav-links");

if (menu) {
    menu.addEventListener("click", () => {
        navlinks.classList.toggle("active");
    }); 
}

const modal = document.getElementById("modal");
const modalTitulo = document.getElementById("modal-titulo");
const modalPrecos = document.getElementById("modal-precos");

const precos = {
    Rosas: {
        titulo: "Rosas",
        opcoes: [
            "Unitário: R$ 8,00",
            "Arranjo: R$ 50,00",
            "Buquê: R$ 80,00"
        ]
    },
    Girassóis: {
        titulo: "Girassóis",
        opcoes: [
            "Unitário: R$ 10,00",
            "Arranjo: R$ 55,00",
            "Buquê: R$ 90,00"
        ]
    },
    Tulipas: {
        titulo: "Tulipas",
        opcoes: [
            "Unitário: R$ 12,00",
            "Arranjo: R$ 60,00",
            "Buquê: R$ 95,00"
        ]
    },
    Lírios: {
        titulo: "Lírios",
        opcoes: [
            "Unitário: R$ 20,00",
            "Arranjo: R$ 70,00",
            "Buquê: R$ 110,00"
        ]
    },
    Orquídeas: {
        titulo: "Orquídeas",
        opcoes: [
            "Unitário: R$ 20,00",
            "Arranjo: R$ 70,00",
            "Buquê: R$ 110,00"
        ]
    },
    Gerberas: {
        titulo: "Gerberas",
        opcoes: [
            "Unitário: R$ 20,00",
            "Arranjo: R$ 70,00",
            "Buquê: R$ 110,00"
        ]
    }
};

function abrirModal(flor) {
    if (!precos[flor]) return;

    modalTitulo.textContent = precos[flor].titulo;
    modalPrecos.innerHTML = "";

    precos[flor].opcoes.forEach(opcao => {
        const li = document.createElement("li");
        li.textContent = opcao;
        modalPrecos.appendChild(li);
    });

    modal.style.display = "flex";
}

function fecharModal() {
    modal.style.display = "none";
}

window.onclick = function(e) {
    if (e.target === modal) {
        fecharModal();
    }
}