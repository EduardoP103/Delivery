window.addEventListener('DOMContentLoaded', function () {
				debugger
				var passwordToggle = document.querySelector('.password-toggle');
				var passwordInput = document.getElementById('yourPassword');

				passwordToggle.addEventListener('click', function () {
					if (passwordInput.type === 'password') {
						passwordInput.type = 'text';
						passwordToggle.innerHTML = '<i class="bi bi-eye"></i>';
					} else {
						passwordInput.type = 'password';
						passwordToggle.innerHTML = '<i class="bi bi-eye-slash"></i>';
					}
				});

				// Resto del código...
			});