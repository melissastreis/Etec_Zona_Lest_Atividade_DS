const cadastroForm = document.getElementById("cadastroForm");

if (cadastroForm) {
  cadastroForm.addEventListener("submit", function (e) {
    e.preventDefault();

    const nome = document.getElementById("cadastroNome").value;
    const email = document.getElementById("cadastroEmail").value;
    const senha = document.getElementById("cadastroSenha").value;

    localStorage.setItem("usuario", JSON.stringify({ nome, email, senha }));

    alert("Cadastro realizado com sucesso!");
    window.location.href = "login.html";
  });
}



const loginForm = document.getElementById("loginForm");

if (loginForm) {
  loginForm.addEventListener("submit", function (e) {
    e.preventDefault();

    const email = document.getElementById("loginEmail").value;
    const senha = document.getElementById("loginSenha").value;

    const user = JSON.parse(localStorage.getItem("usuario"));

    if (!user) {
      alert("Nenhum usuário encontrado. Cadastre-se primeiro!");
      return;
    }

    if (email === user.email && senha === user.senha) {
      alert("Login efetuado!");
      window.location.href = "index.html";
    } else {
      alert("Email ou senha incorretos.");
    }
  });
}
