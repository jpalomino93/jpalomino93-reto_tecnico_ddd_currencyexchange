# Backend : ExchangeRate-API

## Guía de uso

### Api Request Simple

Elija su moneda base y el punto final Estándar simplemente devolverá las tasas de conversión de su código de moneda base a todas las demás que admitimos en un formato JSON fácil de analizar.

Para utilizar nuestro punto final estándar, simplemente realice las dos sustituciones que se explican a continuación y luego envíe una solicitud GET.

• Sustituya `YOUR-API-KEY` con la clave API que se muestra en su panel de control.

• Sustituye `USD` con el código que deseas utilizar como moneda base.

Base url :

``` bash
GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD
https://v6.exchangerate-api.com/v6/edd3e9510493c0439b27b639/latest/USD
```

### Pair Convertion Request

Recurso para convertir entre dos monedas específicas y no está interesado en ninguna otra.Deberás elegir el código de tu moneda base y la moneda de destino para la que deseas obtener el tipo de cambio. Luego, recibirás una respuesta JSON mínima de nuestra API con exactamente los datos que necesitas. Es una respuesta mucho más pequeña que la que obtendrías de nuestro punto de conexión estándar: es rápido y fácil de desarrollar.

• Sustituya `YOUR-API-KEY` con la clave API que se muestra en su panel de control.

• Sustituye `EUR` con el código que deseas utilizar como moneda base.

• Sustituya `GBP` con el código que desea utilizar como moneda de destino.
https://v6.exchangerate-api.com/v6/ TU-CLAVE-API / par/ EUR / GBP

``` bash
GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/EUR/GBP
    https://v6.exchangerate-api.com/v6/edd3e9510493c0439b27b639/pair/EUR/GBP
```


