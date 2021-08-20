### Linux

- Descargar Git-Credential-Manager-Core desde [aquí](https://github.com/microsoft/Git-Credential-Manager-Core#other-ubuntudebian-distributions).
- Ejecutar ```git config --global credential.credentialStore cache```
- Seleccionar tiempo en segundos. En este ejemplo se eligieron 360 segundos

  ```git config --global credential.cacheOptions "--timeout 360"```
  
### Windows

- Descargar versión que incluye Git-Credential-Manager-Core, [aquí](Git-2.33.0-32-bit.exe
  )
- Ejecutar ```git config --global credential.credentialStore cache```
- Seleccionar tiempo en segundos. En este ejemplo se eligieron 360 segundos
  
  ```git config --global credential.cacheOptions "--timeout 360"```


- [fuente 1](https://docs.github.com/en/get-started/getting-started-with-git/caching-your-github-credentials-in-git)
- [fuente 2](https://github.com/microsoft/Git-Credential-Manager-Core/blob/main/docs/linuxcredstores.md#3-gits-built-in-credential-cache)
