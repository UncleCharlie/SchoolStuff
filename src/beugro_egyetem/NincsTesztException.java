/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beugro_egyetem;

/**
 *
 * @author guthk
 */
public class NincsTesztException extends Exception{

    public NincsTesztException() {
    }

    public NincsTesztException(String message) {
        super(message);
    }

    public NincsTesztException(String message, Throwable cause) {
        super(message, cause);
    }

    public NincsTesztException(Throwable cause) {
        super(cause);
    }

    public NincsTesztException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
  }
