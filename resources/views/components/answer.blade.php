<div class="col-xxl-6 col-xl-6 col-lg-6 col-md-6 col-sm-12 col-12 text-center">
    <a href="{{ route('answer', Crypt::encryptString($region)) }}" class="text-decoration-none">
        <p class="response-option">{{ $region }}</p>
    </a>
</div>