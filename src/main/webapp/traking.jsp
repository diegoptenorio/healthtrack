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
    <div class="container">
        <div class="card">
            <div class="card-title">
                <h1>Acompanhamento de peso</h1>
            </div>
            <div class="card-body graph-weigth row">
                <figure>
                    <img src="./img/graph-weigth.svg" alt="Gráfico de peso">
                </figure>
            </div>
        </div>
        <div class="graph-imc">
            <figure>
                <img src="./img/graph-imc.svg" alt="Gráfico de peso">
            </figure>
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
                <a href="#" class="btn btn-link active">
                    <img src="./img/trending.svg">
                </a>
            </li>
            <li class="nav-item col-3">
                <a href="./settings.jsp" class="btn btn-link">
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