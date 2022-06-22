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
            <button type="button" class="btn btn-link" data-bs-toggle="modal" data-bs-target="#modal-activity">
                <img src="./img/add.svg" alt="Adicionar treino">
            </button>
    </header>
    <div class="container">
        <div class="card">
            <div class="card-title">
                <h1>Treinos registrados</h1>
            </div>
            <div class="card-body row">
                <div class="date col-sm-4">
                    <span>12</span>
                    <span>Nov</span>
                    <span>2021</span>
                </div>
                <div class="col-sm-4">
                    <p class="card-text"><span class="medium">Cardio</span></p>
                </div>
                <div class="add col-sm-4">
                    <a href="#" class="btn btn-link"><img src="./img/more.svg" alt="Ver detalhes"></a>
                </div>
            </div>
            <div class="card-body row">
                <div class="date col-sm-4">
                    <span>01</span>
                    <span>Nov</span>
                    <span>2021</span>
                </div>
                <div class="col-sm-4">
                    <p class="card-text"><span class="medium">Pernas</span></p>
                </div>
                <div class="add col-sm-4">
                    <a href="#" class="btn btn-link"><img src="./img/more.svg" alt="Ver detalhes"></a>
                </div>
            </div>
            <div class="card-body row">
                <div class="date col-sm-4">
                    <span>27</span>
                    <span>Out</span>
                    <span>2021</span>
                </div>
                <div class="col-sm-4">
                    <p class="card-text"><span class="medium">Trícepis</span></p>
                </div>
                <div class="add col-sm-4">
                    <a href="#" class="btn btn-link"><img src="./img/more.svg" alt="Ver detalhes"></a>
                </div>
            </div>
            <div class="card-body row">
                <div class="date col-sm-4">
                    <span>20</span>
                    <span>Out</span>
                    <span>2021</span>
                </div>
                <div class="col-sm-4">
                    <p class="card-text"><span class="medium">Bícepis</span></p>
                </div>
                <div class="add col-sm-4">
                    <a href="#" class="btn btn-link"><img src="./img/more.svg" alt="Ver detalhes"></a>
                </div>
            </div>
            <div class="card-body row">
                <div class="date col-sm-4">
                    <span>18</span>
                    <span>Out</span>
                    <span>2021</span>
                </div>
                <div class="col-sm-4">
                    <p class="card-text"><span class="medium">Ombro</span></p>
                </div>
                <div class="add col-sm-4">
                    <a href="#" class="btn btn-link"><img src="./img/more.svg" alt="Ver detalhes"></a>
                </div>
            </div>
            <div class="card-body row">
                <div class="date col-sm-4">
                    <span>16</span>
                    <span>Out</span>
                    <span>2021</span>
                </div>
                <div class="col-sm-4">
                    <p class="card-text"><span class="medium">Costas</span></p>
                </div>
                <div class="add col-sm-4">
                    <a href="#" class="btn btn-link"><img src="./img/more.svg" alt="Ver detalhes"></a>
                </div>
            </div>
            <div class="card-body row">
                <div class="date col-sm-4">
                    <span>14</span>
                    <span>Out</span>
                    <span>2021</span>
                </div>
                <div class="col-sm-4">
                    <p class="card-text"><span class="medium">Cardio</span></p>
                </div>
                <div class="add col-sm-4">
                    <a href="#" class="btn btn-link"><img src="./img/more.svg" alt="Ver detalhes"></a>
                </div>
            </div>
            <div class="card-body row">
                <div class="date col-sm-4">
                    <span>11</span>
                    <span>Out</span>
                    <span>2021</span>
                </div>
                <div class="col-sm-4">
                    <p class="card-text"><span class="medium">Pernas</span></p>
                </div>
                <div class="add col-sm-4">
                    <a href="#" class="btn btn-link"><img src="./img/more.svg" alt="Ver detalhes"></a>
                </div>
            </div>
        </div>
    </div>
    <footer>
        <ul class="nav container main-menu">
            <li class="nav-item col-3">
                <a href="#" class="btn btn-link active">
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
                <a href="./settings.jsp" class="btn btn-link">
                    <img src="./img/settings.svg">
                </a>
            </li>
        </ul>
    </footer>
    <div class="modal fade" id="modal-activity" tabindex="-1" aria-labelledby="modalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h1 class="modal-title">Adicionar treino</h1>
                    <button type="button" class="btn btn-link rotate-45" data-bs-dismiss="modal" aria-label="Close">
                        <img src="./img/add.svg" alt="Fechar">
                    </button>
                </div>
                <div class="modal-body">
                    <div class="input-group">
                        <input type="text" class="form-control" aria-label="name" placeholder="Nome do treino">
                    </div>
                    <hr />
                    <div class="input-group">
                        <input type="text" class="form-control" aria-label="exercise" placeholder="Exercício">
                    </div>
                    <div class="row g-3">
                        <div class="col-sm-6">
                            <div class="input-group">
                                <select class="form-select">
                                    <option selected>Séries</option>
                                    <option value="1">x1</option>
                                    <option value="2">x2</option>
                                    <option value="3">x3</option>
                                    <option value="4">x4</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="input-group">
                                <select class="form-select">
                                    <option selected>Repetições</option>
                                    <option value="1">1</option>
                                    <option value="8">8</option>
                                    <option value="12">12</option>
                                    <option value="15">15</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <div class="row g-3">
                        <div class="col-sm-6">
                            <div class="input-group">
                                <input type="text" class="form-control" aria-label="intensity" placeholder="Intensidade">
                            </div>
                        </div>
                        <div class="col-sm-6">
                            <div class="input-group">
                                <select class="form-select">
                                    <option selected>Medida</option>
                                    <option value="kmh">KM/H</option>
                                    <option value="km">KM</option>
                                    <option value="s">Segundos</option>
                                    <option value="m">Minutos</option>
                                    <option value="h">Horas</option>
                                    <option value="KG">KG</option>
                                </select>
                            </div>
                        </div>
                    </div>
                    <a href="#" class="btn btn-link btn-link-icon">
                        <img src="./img/add.svg" alt="Adicionar Exercício">
                        Exercício
                    </a>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Salvar</button>
                </div>
            </div>
        </div>
    </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>