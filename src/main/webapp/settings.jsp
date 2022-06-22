<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!doctype html>
<html lang="pt-br">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="icon" type="image/x-icon" href="./favicon.ico">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link href="./css/style.css" rel="stylesheet">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Oswald:wght@500&display=swap" rel="stylesheet">
    <title>HealthTrack</title>
</head>
<body>
    <header class="container">
            <a href="./dashboard.jsp" class="btn btn-link"><img src="./img/arrow.svg" alt="Voltar"></a>
            <figure id="logo"><img src="./img/logo.svg" alt="Logo HealthTrack"></figure>
            <button type="button" class="btn btn-link">
            </button>
    </header>
    <div class="container settings">
        <div class="row user-picture">
            <div class="col-sm-4">
                <figure>
                    <img src="./img/user-picture.svg" alt="Foto de usuário">
                </figure>
            </div>
            <div class="col-sm-8 user-data">
                <div class="col-12">
                <h1>Visitante</h1>
                <a href="./index.jsp" class="btn btn-link btn-link-icon">
                    <img src="./img/log-out.svg" alt="Sair">
                    Sair
                </a></div>
            </div>
        </div>
        <div class="card">
            <div class="card-title">
                <h1>Configurações</h1>
            </div>
            <div class="card-body row">
                <a href="#" class="btn btn-link btn-link-icon">
                    <img src="./img/user_green.svg" alt="Editar Perfil">
                    Editar Perfil
                </a>
                <a href="#" class="btn btn-link btn-link-icon">
                    <img src="./img/lock_green.svg" alt="Alterar Senha">
                    Alterar Senha
                </a>
                <a href="#" class="btn btn-link btn-link-icon">
                    <img src="./img/trash_green.svg" alt="Deletar Conta">
                    Deletar Conta
                </a>
            </div>
        </div>
    </div>
    <footer>
        <ul class="nav container main-menu">
            <li class="nav-item col-3">
                <a href="./activity.jsp" class="btn btn-link">
                    <img src="./img/activity.svg">
                </a>
            </li>
            <li class="nav-item col-3">
                <a href="./weigth.jsp" class="btn btn-link">
                    <img src="./img/bar-chart.svg">
                </a>
            </li>
            <li class="nav-item col-3">
                <a href="./traking.jsp" class="btn btn-link">
                    <img src="./img/trending.svg">
                </a>
            </li>
            <li class="nav-item col-3">
                <a href="#" class="btn btn-link active">
                    <img src="./img/settings.svg">
                </a>
            </li>
        </ul>
    </footer>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>