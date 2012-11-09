/*
 * Copyright (C) 2008, EGT Consultores, C.A.
 *
 * Este programa es software libre; usted puede redistribuirlo y/o modificarlo bajo los terminos
 * de la licencia "GNU General Public License" publicada por la Fundacion "Free Software Foundation".
 *
 * Este programa se distribuye con la esperanza de que pueda ser util, pero SIN NINGUNA GARANTIA;
 * vea la licencia "GNU General Public License" para obtener mas informacion.
 */
package com.egt.ejb.business.process.logic;

/*
import com.egt.commons.info.ImageInfo;
import com.egt.commons.util.HexUtils;
import com.egt.commons.util.IntUtils;
import com.egt.commons.util.LongUtils;
import com.egt.commons.util.TimeUtils;
import com.egt.core.util.Utils;
import com.egt.ejb.persistence.entity.ArchivoAdjunto;
import com.egt.ejb.persistence.entity.Usuario;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Date;
import org.apache.commons.io.FileUtils;
*/

public class XBPL {
	/*
    static ArchivoAdjunto newArchivoAdjunto(String filename, Usuario usuario) throws IOException {
        ArchivoAdjunto archivoAdjunto = new ArchivoAdjunto();
        archivoAdjunto.setIdArchivoAdjunto(LongUtils.getNewId());
        archivoAdjunto.setVersionArchivoAdjunto(0L);
        return updateArchivoAdjunto(archivoAdjunto, filename, usuario);
    }

    static ArchivoAdjunto updateArchivoAdjunto(ArchivoAdjunto archivoAdjunto, String filename, Usuario usuario) throws IOException {
        Date stmp = (Date) TimeUtils.currentTimestamp();
        String path = Utils.getAttachedFileName(filename);
        String name = Utils.getAttachedFileSimpleName(filename);
        File file = new File(path);
        byte[] bytes = FileUtils.readFileToByteArray(file);
        ImageInfo imageInfo = new ImageInfo();
        RandomAccessFile input = new RandomAccessFile(file, "r");
        imageInfo.setInput(input); // input can be InputStream or RandomAccessFile
        imageInfo.setDetermineImageNumber(false); // default is false
        imageInfo.setCollectComments(false); // default is false
        archivoAdjunto.setCodigoArchivoAdjunto(name);
        archivoAdjunto.setNombreArchivoAdjunto(filename);
        archivoAdjunto.setFechaHoraArchivoAdjunto(stmp);
        archivoAdjunto.setUsuarioIdUsuarioArchivoAdjunto(usuario);
        archivoAdjunto.setObjetoArchivoAdjunto(HexUtils.convert(bytes));
        archivoAdjunto.setBytesArchivoAdjunto(bytes.length);
        if (imageInfo.check()) {
            archivoAdjunto.setFormatoImagen(imageInfo.getFormatName());
            archivoAdjunto.setTipoMimeImagen(imageInfo.getMimeType());
            archivoAdjunto.setAlturaImagen(imageInfo.getHeight());
            archivoAdjunto.setAnchuraImagen(imageInfo.getWidth());
            archivoAdjunto.setBitsPorPixelImagen(imageInfo.getBitsPerPixel());
            archivoAdjunto.setEsImagenProgresiva(IntUtils.valueOf(imageInfo.isProgressive()));
        } else {
            archivoAdjunto.setFormatoImagen(null);
            archivoAdjunto.setTipoMimeImagen(null);
            archivoAdjunto.setAlturaImagen(0);
            archivoAdjunto.setAnchuraImagen(0);
            archivoAdjunto.setBitsPorPixelImagen(0);
            archivoAdjunto.setEsImagenProgresiva(IntUtils.FALSE);
        }
        input.close();
        return archivoAdjunto;
    }
	*/
}
