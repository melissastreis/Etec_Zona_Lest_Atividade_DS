<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $numero = 10;
    $letra = "10";
    if (var_dump($numero === $letra)){
        echo "Valor e tipo igual";
    } else {
        echo "Valor igual mas tipo difeente";
    }
    ?>
</body>
</html>