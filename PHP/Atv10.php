<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <?php
    $nota1 = 8;
    $nota2 = 6.5;
    $nota3 = 7;

    $media = ($nota1 + $nota2 + $nota3) / 3;
    if ($media >= 7) {
        echo "Aluno aprovado com média " . number_format($media, 2) . "\n";
    } else {
        echo "Aluno reprovado com média " . number_format($media, 2) . "\n";
    }
    ?>
</body>

</html>