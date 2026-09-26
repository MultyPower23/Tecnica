# Clase_27

## 📚 Tema central

Arranque de Programación para Dispositivos Móviles: tipos de aplicaciones y el proceso de desarrollo de apps.

## 🧠 Qué se vio

El módulo va con Android Studio y Kotlin y dura 10 semanas en total, aunque la primera es de introducción y la última es para la entrega final, así que quedan 8 semanas de contenido real. Cubre diseño de software orientado a móviles, desarrollo de apps y pruebas/depuración con simuladores.

Antes de entrar en tipos de apps hicieron un repaso rápido de qué es software y qué es hardware, y quedó una idea clave dando vueltas: uno no programa para sí mismo, programa para el consumidor. La distinción entre cliente y consumidor depende de para quién trabajás: si vendés o trabajás directo para una empresa, esa empresa es el cliente, y los consumidores son quienes le compran a esa empresa (no la empresa misma). Si en cambio desarrollás una app propia que se distribuye directo al público, ahí el consumidor es quien la usa.

Después vinieron los 4 tipos de aplicación móvil, cada uno con su trade-off:

**App nativa** — se hace específicamente para un sistema operativo (iOS o Android) en el lenguaje propio de esa plataforma (Kotlin para Android, Swift para iOS). Una app nativa de Android no corre en iOS y viceversa.

- Ventajas: el mejor rendimiento posible porque está optimizada para ese hardware/SO específico, acceso completo a cámara/micrófono/sensores/lector biométrico/redes, y puede funcionar offline si se diseñó para eso.
- Desventajas: costos altos (dos líneas de desarrollo separadas, el código de una no sirve para la otra), necesitas gente experta en cada lenguaje, y el desarrollo tarda de 4 a 6 meses.

**App web** — un sitio web hecho para parecer una app móvil, pero solo se accede desde el navegador (Safari, Chrome, etc.), escrita en HTML5 y JavaScript.

- Ventajas: una sola línea de desarrollo sirve para todas las plataformas, tecnologías conocidas y fáciles de aplicar, tiempo y costo bajos.
- Desventajas: acceso limitado a las funciones del dispositivo, no se puede subir a las tiendas de apps, la experiencia cambia según el navegador, y necesita internet incluso si se pensó para funcionar offline (por ejemplo para actualizarse o para el primer ingreso).

**App híbrida** — mezcla nativo y web: se programa con HTML, CSS y JavaScript pero se empaqueta en un formato instalable como cualquier app nativa.

- Ventajas: menor costo (usa lenguajes más comunes y con más gente disponible en el mercado), carácter multiplataforma con una sola línea de desarrollo, acceso a algunas funciones del móvil, tiempos de desarrollo más cortos (~3 meses), y se pueden subir a App Store / Google Play con la opción de monetizar.
- Desventajas: rendimiento inferior al nativo (suelen pesar más y ser más lentas), y el acceso a las funciones del dispositivo es limitado.

**App multiplataforma** — parecida a la híbrida en que comparte código, pero se escribe una vez y se reutiliza compilando proyectos individuales por plataforma (herramientas como React Native, Xamarin o Flutter).

- Ventajas: una única base de código sirve para iOS y Android, puede salir hasta un 30% más económica, y es posible compilar para ambas plataformas al tiempo.
- Desventajas: menor rendimiento que la nativa, diseño de código más complejo, y hay que esperar más tiempo para que el framework soporte funciones nuevas del sistema.

Sobre el proceso de desarrollo de apps móviles, el proceso completo tiene varias fases (Estrategia, Planificación, Diseño, Implementación, Pruebas y Lanzamiento), pero en esta clase solo alcanzaron a ver dos a fondo:

**Planificación** — el "cómo" llegar al objetivo, dividiendo el proyecto en tareas manejables: armar un roadmap con las funcionalidades prioritarias (ej. login, registro, notificaciones push), estimar tiempo y recursos con algo como Trello, Jira o incluso un Excel, elegir tecnología (Kotlin/Java + Android Studio para Android, Swift + Xcode para iOS, o algo cross-platform como Flutter), y definir el equipo y los riesgos (por ejemplo compatibilidad con versiones viejas del sistema operativo).

**Diseño** — la fase creativa donde la app toma forma visual y funcional, como el arquitecto dibujando cómo se ve y cómo fluye la casa. Incluye diseño de UI/UX (wireframes y mockups con Figma, Adobe XD o Sketch, pensando en usabilidad móvil: botones grandes, navegación intuitiva) y arquitectura técnica (base de datos, por ejemplo Firebase, APIs y flujo de datos). Remarcaron pensar en accesibilidad: colores aptos para daltónicos y soporte para lectores de pantalla.

El profe también metió alguna que otra dinámica para ver cómo era el grupo.

## 💻 Ejercicios trabajados

No hubo código esta clase — fue toda teoría introductoria del módulo.

## ⚠️ Errores comunes / cosas a las que prestar atención

- Híbrida y multiplataforma se prestan a confusión: la híbrida empaqueta una sola app web dentro de un contenedor nativo, mientras que la multiplataforma compila proyectos individuales por plataforma reutilizando la misma base de código — por eso rinde distinto y tiene otro flujo de actualización.
- Las fechas de evaluación anotadas en clase no son correctas — toca esperar la hoja oficial que entregan en la próxima clase.
- Del proceso de desarrollo completo (Estrategia, Planificación, Diseño, Implementación, Pruebas, Lanzamiento) solo se vieron Planificación y Diseño a fondo — las demás fases quedan pendientes de cuando las vean en clase.

## ✅ Ideas clave

- 🎯 Módulo con Android Studio + Kotlin, 10 semanas (8 de contenido real, sin contar intro ni entrega final), foco en diseño, desarrollo y pruebas con simuladores.
- 📱 Nativa: el mejor rendimiento y acceso al hardware, pero la más cara y lenta de construir.
- 🌐 Web: la más barata y rápida de armar, pero la más limitada en funciones y distribución.
- 🔀 Híbrida y multiplataforma buscan un punto medio entre rendimiento y reutilización de código, cada una con su propio trade-off.
- 🗺️ De las 6 fases del desarrollo (Estrategia, Planificación, Diseño, Implementación, Pruebas, Lanzamiento), esta clase cubrió Planificación y Diseño.
- 📋 La planificación define el roadmap, las herramientas y los riesgos antes de tocar código.
- 🎨 El diseño da forma visual y arquitectura técnica a la app, sin perder de vista la accesibilidad.
- 🙋 No se programa para uno mismo: se programa para el consumidor, aunque quién es "cliente" y quién es "consumidor" depende de si trabajás para una empresa o distribuís directo al público.
