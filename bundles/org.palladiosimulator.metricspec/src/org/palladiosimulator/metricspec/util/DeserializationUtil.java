package org.palladiosimulator.metricspec.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/**
 * Class containing utilities for deserializing objects using the selected class loader.
 * @author stier
 *
 */
public final class DeserializationUtil {
    
    /**
     * Deserializes an Object from a String using the current class loader.
     * @param hexString The current string.
     * @param loader The current class loader.
     * @return The deserialized object.
     */
    public static Object createFromString(final String hexString, final ClassLoader loader) {
        if (hexString == null) {
            return null;
        } else {
            byte[] byteValue = hexStringToBytes(hexString);
            ByteArrayInputStream bytes = new ByteArrayInputStream(byteValue);
            try {
                ObjectInputStream in = new ObjectInputStream(bytes) {
                    protected Class<?> resolveClass(ObjectStreamClass desc)
                            throws IOException, ClassNotFoundException
                        {
                            String name = desc.getName();
                            try {
                                return Class.forName(name, false, loader);
                            } catch (ClassNotFoundException ex) {
                                ex.printStackTrace();
                            }
                            return null;
                        }
                };
                return in.readObject();
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            } catch (ClassNotFoundException exception) {
                throw new RuntimeException(exception);
            }
        }
    }
    
    /**
     * Converts a hexadecimal String to a byte array.
     * @param initialValue The hexadecimal String
     * @return The byte array.
     */
    private static byte[] hexStringToBytes(String initialValue) {
        if (initialValue == null) {
            return null;
        }

        int size = initialValue.length();
        int limit = (size + 1) / 2;
        byte[] result = new byte[limit];
        if (size % 2 != 0) {
            result[--limit] = hexCharToByte(initialValue.charAt(size - 1));
        }

        for (int i = 0, j = 0; i < limit; ++i) {
            byte high = hexCharToByte(initialValue.charAt(j++));
            byte low = hexCharToByte(initialValue.charAt(j++));
            result[i] = (byte) (high << 4 | low);
        }
        return result;
    }
    

    /**
     * Converts a character representing a hexadecimal character to a byte value.
     * @param character The hexadecimal character.
     * @return The byte value.
     */
    private static byte hexCharToByte(char character) {
        switch (character) {
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9': {
            return (byte) (character - '0');
        }
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f': {
            return (byte) (character - 'a' + 10);
        }
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F': {
            return (byte) (character - 'A' + 10);
        }
        default: {
            throw new NumberFormatException("Invalid hexadecimal");
        }
        }
    }
}
