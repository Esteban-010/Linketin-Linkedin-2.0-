let data = {};
const app = new Vue(
    {
        el: "#elemento",
        data: {
            mostrarLogin: true,
            mostrarRegister: false,
            mostrarContent: false,
            usuario: {}
        },
        methods: {
            mostrarR: function(){
                this.mostrarRegister = true;
                this.mostrarLogin = false;
                this.mostrarContent = false
            },
            mostarC: function(){
                this.mostrarContent = true;
                this.mostrarLogin = false;
                this.mostrarRegister = false;
                this.usuario = data;
                console.log(this.usuario);
            },
            login : function(){
                axios.get(`http://localhost:8080/usuario/login/${this.usuario.username}/${this.usuario.contrasenia}`)
                .then(response => data = response.data);
                this.mostarC();
            },
            register: function(){
                axios.post("http://localhost:8080/usuario/register", this.usuario)
                .then(request => data = JSON.parse(request.config.data));
                this.mostarC();
            }
        }
    }
);