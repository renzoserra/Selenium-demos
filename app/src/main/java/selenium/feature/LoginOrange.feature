
  Feature: Login
    @orangehrm
    Scenario: Login en Orange
      Given Ingreso credenciales validas "Admin" y "admin123"
      When  Presiono boton login
      Then  Inicio sesion exitosamente
      And   Visualizo boton "Dashboard"