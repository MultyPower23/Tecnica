from tkinter import *  # type: ignore
from tkinter import messagebox
import sqlite3

# ---------------- FORMULARIO ----------------

root = Tk()

# ---------------- MENU BARRA ----------------

barraMenu = Menu(root)
root.config(menu=barraMenu, width=300, height=300)

# Primer menú
bbddMenu = Menu(barraMenu, tearoff=0)
bbddMenu.add_command(label="Conectar")
bbddMenu.add_command(label="Salir")

# Segundo menú
borrarMenu = Menu(barraMenu, tearoff=0)
borrarMenu.add_command(label="Borrar campo")

# Tercer menú
crudMenu = Menu(barraMenu, tearoff=0)
crudMenu.add_command(label="Crear")
crudMenu.add_command(label="Leer")
crudMenu.add_command(label="Actualizar")
crudMenu.add_command(label="Borrar")

# Cuarto menú
ayudaMenu = Menu(barraMenu, tearoff=0)
ayudaMenu.add_command(label="Licencia")
ayudaMenu.add_command(label="Acerca de...")

# Agregar menús a la barra
barraMenu.add_cascade(label="BBDD", menu=bbddMenu)
barraMenu.add_cascade(label="Borrar", menu=borrarMenu)
barraMenu.add_cascade(label="CRUD", menu=crudMenu)
barraMenu.add_cascade(label="Ayuda", menu=ayudaMenu)

# ---------------- CAMPOS ----------------

miFrame = Frame(root)
miFrame.pack()

miID = StringVar()
miNombre = StringVar()
miPass = StringVar()
miApellido = StringVar()
miDireccion = StringVar()

# Campo ID
cuadroID = Entry(miFrame, textvariable=miID)
cuadroID.grid(row=0, column=1, padx=10, pady=10)
cuadroID.config(fg="maroon", justify="right")

# Campo Nombre
cuadroNombre = Entry(miFrame, textvariable=miNombre)
cuadroNombre.grid(row=1, column=1, padx=10, pady=10)

# Campo Password
cuadroPass = Entry(miFrame, textvariable=miPass)
cuadroPass.grid(row=2, column=1, padx=10, pady=10)
cuadroPass.config(show="*")

# Campo Apellido
cuadroApellido = Entry(miFrame, textvariable=miApellido)
cuadroApellido.grid(row=3, column=1, padx=10, pady=10)

# Campo Dirección
cuadroDireccion = Entry(miFrame, textvariable=miDireccion)
cuadroDireccion.grid(row=4, column=1, padx=10, pady=10)

# Área de comentarios
textoComentario = Text(miFrame, width=16, height=5)
textoComentario.grid(row=5, column=1, padx=10, pady=10)

scrollVer = Scrollbar(miFrame, command=textoComentario.yview)
scrollVer.grid(row=5, column=2, sticky="nsew")

textoComentario.config(yscrollcommand=scrollVer.set)

# Labels
idLabel = Label(miFrame, text="ID")
idLabel.grid(row=0, column=0, sticky="e", padx=10, pady=10)

nombreLabel = Label(miFrame, text="Nombre")
nombreLabel.grid(row=1, column=0, sticky="e", padx=10, pady=10)

passLabel = Label(miFrame, text="Password")
passLabel.grid(row=2, column=0, sticky="e", padx=10, pady=10)

apellidoLabel = Label(miFrame, text="Apellido")
apellidoLabel.grid(row=3, column=0, sticky="e", padx=10, pady=10)

direccionLabel = Label(miFrame, text="Dirección")
direccionLabel.grid(row=4, column=0, sticky="e", padx=10, pady=10)

comentarioLabel = Label(miFrame, text="Comentario")
comentarioLabel.grid(row=5, column=0, sticky="e", padx=10, pady=10)

# ---------------- FUNCIONES ----------------


def conexionBBDD():

    miConexion = sqlite3.connect("Usuarios")
    miCursor = miConexion.cursor()

    try:
        miCursor.execute("""
            CREATE TABLE DATOSUSUARIOS(
            ID INTEGER PRIMARY KEY AUTOINCREMENT,
            NOMBRE_USUARIO VARCHAR(50),
            PASSWORD VARCHAR(50),
            APELLIDO VARCHAR(50),
            DIRECCION VARCHAR(100),
            COMENTARIO VARCHAR(100)
            )
        """)

        messagebox.showinfo("BBDD", "Base de datos creada correctamente")

    except:
        messagebox.showwarning("¡Atención!", "La base de datos ya existe")


def salirAplicacion():

    valor = messagebox.askquestion("Salir", "¿Desea salir de la aplicación?")

    if valor == "yes":
        root.destroy()


def limpiarCampos():

    miID.set("")
    miNombre.set("")
    miPass.set("")
    miApellido.set("")
    miDireccion.set("")
    textoComentario.delete(1.0, END)


def crear():

    miConexion = sqlite3.connect("Usuarios")
    miCursor = miConexion.cursor()

    datos = (
        miNombre.get(),
        miPass.get(),
        miApellido.get(),
        miDireccion.get(),
        textoComentario.get("1.0", END),
    )

    miCursor.execute("INSERT INTO DATOSUSUARIOS VALUES(NULL,?,?,?,?,?)", datos)

    miConexion.commit()

    messagebox.showinfo("BBDD", "Registro insertado con éxito")


def leer():

    miConexion = sqlite3.connect("Usuarios")
    miCursor = miConexion.cursor()

    miCursor.execute("SELECT * FROM DATOSUSUARIOS WHERE ID=" + miID.get())

    elUsuario = miCursor.fetchall()

    for usuario in elUsuario:

        miID.set(usuario[0])
        miNombre.set(usuario[1])
        miPass.set(usuario[2])
        miApellido.set(usuario[3])
        miDireccion.set(usuario[4])

        textoComentario.delete(1.0, END)
        textoComentario.insert(1.0, usuario[5])


def actualizar():

    miConexion = sqlite3.connect("Usuarios")
    miCursor = miConexion.cursor()

    miCursor.execute(
        "UPDATE DATOSUSUARIOS SET "
        "NOMBRE_USUARIO='"
        + miNombre.get()
        + "', PASSWORD='"
        + miPass.get()
        + "', APELLIDO='"
        + miApellido.get()
        + "', DIRECCION='"
        + miDireccion.get()
        + "', COMENTARIO='"
        + textoComentario.get("1.0", END)
        + "' WHERE ID="
        + miID.get()
    )

    miConexion.commit()

    messagebox.showinfo("BBDD", "Registro actualizado con éxito")


def eliminar():

    miConexion = sqlite3.connect("Usuarios")
    miCursor = miConexion.cursor()

    miCursor.execute("DELETE FROM DATOSUSUARIOS WHERE ID=" + miID.get())

    miConexion.commit()

    messagebox.showinfo("BBDD", "Registro eliminado con éxito")


# ---------------- BOTONES ----------------

miFrame2 = Frame(root)
miFrame2.pack()

botonCrear = Button(miFrame2, text="Crear", command=crear)

botonCrear.grid(row=0, column=0, sticky="e", padx=10, pady=10)

botonLeer = Button(miFrame2, text="Leer", command=leer)

botonLeer.grid(row=0, column=1, sticky="e", padx=10, pady=10)

botonActualizar = Button(miFrame2, text="Actualizar", command=actualizar)

botonActualizar.grid(row=0, column=2, sticky="e", padx=10, pady=10)

botonEliminar = Button(miFrame2, text="Eliminar", command=eliminar)

botonEliminar.grid(row=0, column=3, sticky="e", padx=10, pady=10)

# ---------------- AGREGAR FUNCIONES A MENUS ----------------

bbddMenu.entryconfig("Conectar", command=conexionBBDD)

bbddMenu.entryconfig("Salir", command=salirAplicacion)

borrarMenu.entryconfig("Borrar campo", command=limpiarCampos)

crudMenu.entryconfig("Crear", command=crear)

crudMenu.entryconfig("Leer", command=leer)

crudMenu.entryconfig("Actualizar", command=actualizar)

crudMenu.entryconfig("Borrar", command=eliminar)

root.mainloop()
