<div class="col-6 text-center">
    <a href="{{ route('answer', Crypt::encryptString($region)) }}" class="text-decoration-none">
        <p class="response-option">{{ $region }}</p>
    </a>
</div>