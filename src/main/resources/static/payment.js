document.addEventListener('DOMContentLoaded', function() {
    const checkoutButton = document.getElementById('checkout-button');

    checkoutButton.addEventListener('click', function() {
        fetch('/create-checkout-session?currency=usd&amount=5000')
        .then(response => response.text())
        .then(url => {
          window.location.href = url;
        })
        .catch(error => {
          console.error('Hata:', error);
          alert('Ödeme başlatılırken bir hata oluştu.');
        });
    });
});