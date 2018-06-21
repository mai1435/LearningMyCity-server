package com.tsivas.test;

import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

import retrofit.RestAdapter;
import retrofit.RestAdapter.LogLevel;
import sun.misc.BASE64Encoder;

import com.google.appengine.api.datastore.Text;
import com.tsivas.client.ImageSvcApi;
import com.tsivas.model.Image;

public class ImageSvcClientApiTest {

	
	//private final String TEST_URL = "http://localhost:8888";
	private final String TEST_URL = "http://1-dot-learningmycity.appspot.com";
	
	Image image;
	
	private ImageSvcApi imageService = new RestAdapter.Builder()
	.setEndpoint(TEST_URL)
	.setLogLevel(LogLevel.FULL)
	.build()
	.create(ImageSvcApi.class);
	
	@Test
	public void test() {
		
		// Add images
		try {
			BufferedImage img = ImageIO.read(new File("war/WEB-INF/images/map.png"));
			Text imgstr1 = new Text(encodeToString(img, "png"));
			imageService.addImage(new Image("1", "map", "1", imgstr1));
			
			BufferedImage img2 = ImageIO.read(new File("war/WEB-INF/images/lefkos_pyrgos.jpg"));
			Text imgstr2 = new Text(encodeToString(img2, "jpg"));
			imageService.addImage(new Image("1", "lefkos_pyrgos", "2", imgstr2));

			BufferedImage img3 = ImageIO.read(new File("war/WEB-INF/images/fetix_boulen.jpg"));
			Text imgstr3 = new Text(encodeToString(img3, "jpg"));
			imageService.addImage(new Image("1", "fetix_boulen", "3", imgstr3));
			
			BufferedImage img4 = ImageIO.read(new File("war/WEB-INF/images/lefkos_pyrgos_2.jpg"));
			Text imgstr4 = new Text(encodeToString(img4, "jpg"));
			imageService.addImage(new Image("1", "lefkos_pyrgos_2", "4", imgstr4));

			BufferedImage img5 = ImageIO.read(new File("war/WEB-INF/images/anaktoro_galeriou.jpg"));
			Text imgstr5 = new Text(encodeToString(img5, "jpg"));
			imageService.addImage(new Image("1", "anaktoro_galeriou", "5", imgstr5));

			BufferedImage img6 = ImageIO.read(new File("war/WEB-INF/images/kamara.jpg"));
			Text imgstr6 = new Text(encodeToString(img6, "jpg"));
			imageService.addImage(new Image("1", "kamara", "6", imgstr6));
			
			BufferedImage img7 = ImageIO.read(new File("war/WEB-INF/images/egnatia_odos.jpg"));
			Text imgstr7 = new Text(encodeToString(img7, "jpg"));
			imageService.addImage(new Image("1", "egnatia_odos", "7", imgstr7));
			
			BufferedImage img8 = ImageIO.read(new File("war/WEB-INF/images/arxaia_agora.jpg"));
			Text imgstr8 = new Text(encodeToString(img8, "jpg"));
			imageService.addImage(new Image("1", "arxaia_agora", "8", imgstr8));
			
			BufferedImage img9 = ImageIO.read(new File("war/WEB-INF/images/arxaia_agora_2.jpg"));
			Text imgstr9 = new Text(encodeToString(img9, "jpg"));
			imageService.addImage(new Image("1", "arxaia_agora_2", "9", imgstr9));
			
			BufferedImage img10 = ImageIO.read(new File("war/WEB-INF/images/spa.jpg"));
			Text imgstr10 = new Text(encodeToString(img10, "jpg"));
			imageService.addImage(new Image("1", "spa", "10", imgstr10));
			
			BufferedImage img11 = ImageIO.read(new File("war/WEB-INF/images/anaktoro_galeriou_2.jpg"));
			Text imgstr11 = new Text(encodeToString(img11, "jpg"));
			imageService.addImage(new Image("1", "anaktoro_galeriou_2", "11", imgstr11));
			
			BufferedImage img12 = ImageIO.read(new File("war/WEB-INF/images/oktagwno.jpg"));
			Text imgstr12 = new Text(encodeToString(img12, "jpg"));
			imageService.addImage(new Image("1", "oktagwno", "12", imgstr12));
			
			BufferedImage img13 = ImageIO.read(new File("war/WEB-INF/images/tetrarxia.jpg"));
			Text imgstr13 = new Text(encodeToString(img13, "jpg"));
			imageService.addImage(new Image("1", "tetrarxia", "13", imgstr13));
			
			BufferedImage img14 = ImageIO.read(new File("war/WEB-INF/images/dioklitianos.jpg"));
			Text imgstr14 = new Text(encodeToString(img14, "jpg"));
			imageService.addImage(new Image("1", "dioklitianos", "14", imgstr14));
			
			BufferedImage img15 = ImageIO.read(new File("war/WEB-INF/images/kamara_2.jpg"));
			Text imgstr15 = new Text(encodeToString(img15, "jpg"));
			imageService.addImage(new Image("1", "kamara_2", "15", imgstr15));
			
			BufferedImage img16 = ImageIO.read(new File("war/WEB-INF/images/arxaia_agora_3.jpg"));
			Text imgstr16 = new Text(encodeToString(img16, "jpg"));
			imageService.addImage(new Image("1", "arxaia_agora_3", "16", imgstr16));
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

    /**
     * Encode image to string
     */
    public static String encodeToString(BufferedImage image, String type) {
        String imageString = null;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        try {
            ImageIO.write(image, type, bos);
            byte[] imageBytes = bos.toByteArray();

            BASE64Encoder encoder = new BASE64Encoder();
            imageString = encoder.encode(imageBytes);

            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return imageString;
    }

}
