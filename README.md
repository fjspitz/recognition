# OCR Recognition
Prototipo de uso del motor OCR (Optical Character Recognition) [Tesseract.](https://es.wikipedia.org/wiki/Tesseract_OCR)

### Ubuntu

Instalar el motor Tesseract OCR en el sistema:

```
sudo apt install tesseract-ocr
```

Crear un directorio donde alojar los archivos para idiomas:

```
mkdir /usr/local/share/tessdata
```

Bajar el contenido de los archivos de idioma:

```
wget -P /usr/local/share/tessdata/ https://github.com/tesseract-ocr/tessdata/blob/master/eng.traineddata
wget -O spa.traineddata -P /usr/local/share/tessdata/ https://github.com/tesseract-ocr/tessdata/blob/master/spa_old.traineddata
```

Este proyecto Maven utiliza la dependencia a [Tess4j](http://tess4j.sourceforge.net/)

Se puede probar con los archivos de imágenes de prueba (en castellano) alojados con el código fuente bajo:

```
images/
```
