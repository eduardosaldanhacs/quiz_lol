<x-main-layout pageTitle="QUIZ - LOL">
    <meta http-equiv="refresh" content="1;url={{ $url }}">
    <style>
        .container {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
        }
        .spinner {
            border: 5px solid #ccc;
            border-top: 5px solid #333;
            border-radius: 50%;
            width: 40px;
            height: 40px;
            animation: spin 1s linear infinite;
            margin-bottom: 20px;
        }
        @keyframes spin {
            to { transform: rotate(360deg); }
        }
    </style>
    <div class="container">
        <div class="spinner"></div>
        <h2>Preparando o jogo, por favor aguarde...</h2>
    </div>
</x-main-layout>
