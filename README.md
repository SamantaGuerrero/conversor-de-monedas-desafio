# Conversor de Monedas

Aplicación de consola en Java para convertir entre múltiples monedas en tiempo real utilizando la API pública de ExchangeRate-API.

---

## Características

- Conversión de divisas en tiempo real.
- Soporte para múltiples monedas:
  - USD ⇄ ARS
  - USD ⇄ BRL
  - USD ⇄ COP
  - USD ⇄ MXN
  - USD ⇄ EUR
  - USD ⇄ JPY
- Registro de historial de conversiones con marca de tiempo.
- Interfaz de consola intuitiva.
- Manejo de errores para entradas inválidas o fallas de conexión.

---

## Tecnologías utilizadas

- Java 11+
- `HttpClient` para solicitudes HTTP
- `Gson` para manejo de JSON
- `java.time` para fechas y horas
- API: [ExchangeRate-API](https://www.exchangerate-api.com/)

---

## 📦 Instalación y ejecución

1. **Clona el repositorio o descarga los archivos.**

2. **Asegúrate de tener Java instalado (Java 11 o superior):**
   ```bash
   java -version

3. **Compila el proyecto:**
javac -cp gson-2.10.1.jar com/svgr/conversormonedas/conversor/*.java

4. **Ejecuta la aplicación:**
java -cp .:gson-2.10.1.jar com.svgr.conversormonedas.conversor.ConversorApp

