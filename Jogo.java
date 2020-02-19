import java.util.Scanner; 
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Jogo {
	
	
	public static void main(String [] args) {
		String url = "C:\\Users\\César Vargas\\eclipse-workspace\\Xadrez\\src\\";
		int d = 80;
		
		JFrame tabuleiro = new JFrame("Tabuleiro");
		JPanel caixa = new JPanel();
		
		ImageIcon img_rab = new ImageIcon(url+"RainhaB_B.png");
		ImageIcon img_bpb = new ImageIcon(url+"BispoB_B.png");
		ImageIcon img_rib = new ImageIcon(url+"ReiB_B.png");
		ImageIcon img_cvb = new ImageIcon(url+"CavaloB_B.png");
		ImageIcon img_trb = new ImageIcon(url+"TorreB_B.png");
		ImageIcon img_peb = new ImageIcon(url+"PeaoB_B.png");
		
		ImageIcon Nada = new ImageIcon(url+"Nada.png");
		
		
		JButton rainha = new JButton(img_rab);
		JButton cavalo = new JButton(img_cvb);
		JButton rei = new JButton(img_rib);
		JButton bispo = new JButton(img_bpb);
		JButton torre = new JButton(img_trb);
		
		JButton bispo2 = new JButton(img_bpb);
		JButton torre2 = new JButton(img_trb);
		JButton cavalo2 = new JButton(img_cvb);
		
		JButton peao = new JButton(img_peb);
		JButton peao2 = new JButton(img_peb);
		JButton peao3 = new JButton(img_peb);
		JButton peao4 = new JButton(img_peb);
		JButton peao5 = new JButton(img_peb);
		JButton peao6 = new JButton(img_peb);
		JButton peao7 = new JButton(img_peb);
		JButton peao8 = new JButton(img_peb);
		
		torre.setBackground(new Color(0,0,0));
		cavalo.setBackground(new Color(250,250,250));
		bispo.setBackground(new Color(0,0,0));
		rei.setBackground(new Color(250,250,250));
		rainha.setBackground(new Color(0,0,0));
		bispo2.setBackground(new Color(250,250,250));
		cavalo2.setBackground(new Color(0,0,0));
		torre2.setBackground(new Color(250,250,250));
		
		peao.setBackground(new Color(250,250,250));
		peao2.setBackground(new Color(0,0,0));
		peao3.setBackground(new Color(250,250,250));
		peao4.setBackground(new Color(0,0,0));
		peao5.setBackground(new Color(250,250,250));
		peao6.setBackground(new Color(0,0,0));
		peao7.setBackground(new Color(250,250,250));
		peao8.setBackground(new Color(0,0,0));
		
		
		rainha.setPreferredSize(new Dimension(d,d));
		cavalo.setPreferredSize(new Dimension(d,d));
		cavalo2.setPreferredSize(new Dimension(d,d));
		peao.setPreferredSize(new Dimension(d,d));
		rei.setPreferredSize(new Dimension(d,d));
		bispo.setPreferredSize(new Dimension(d,d));
		torre.setPreferredSize(new Dimension(d,d));
		bispo2.setPreferredSize(new Dimension(d,d));
		torre2.setPreferredSize(new Dimension(d,d));
		peao2.setPreferredSize(new Dimension(d,d));
		peao3.setPreferredSize(new Dimension(d,d));
		peao4.setPreferredSize(new Dimension(d,d));
		peao5.setPreferredSize(new Dimension(d,d));
		peao6.setPreferredSize(new Dimension(d,d));
		peao7.setPreferredSize(new Dimension(d,d));
		peao8.setPreferredSize(new Dimension(d,d));
		
		
		JButton nada = new JButton(Nada);
		JButton nada2 = new JButton(Nada);
		JButton nada3 = new JButton(Nada);
		JButton nada4 = new JButton(Nada);
		JButton nada5 = new JButton(Nada);
		JButton nada6 = new JButton(Nada);
		JButton nada7 = new JButton(Nada);
		JButton nada8 = new JButton(Nada);
		
		JButton nada9 = new JButton(Nada);
		JButton nada10 = new JButton(Nada);
		JButton nada11 = new JButton(Nada);
		JButton nada12 = new JButton(Nada);
		JButton nada13 = new JButton(Nada);
		JButton nada14 = new JButton(Nada);
		JButton nada15 = new JButton(Nada);
		JButton nada16 = new JButton(Nada);
		
		JButton nada17 = new JButton(Nada);
		JButton nada18 = new JButton(Nada);
		JButton nada19 = new JButton(Nada);
		JButton nada20 = new JButton(Nada);
		JButton nada21 = new JButton(Nada);
		JButton nada22 = new JButton(Nada);
		JButton nada23 = new JButton(Nada);
		JButton nada24 = new JButton(Nada);
		
		JButton nada25= new JButton(Nada);
		JButton nada26 = new JButton(Nada);
		JButton nada27 = new JButton(Nada);
		JButton nada28 = new JButton(Nada);
		JButton nada29 = new JButton(Nada);
		JButton nada30 = new JButton(Nada);
		JButton nada31 = new JButton(Nada);
		JButton nada32 = new JButton(Nada);
		
		nada.setPreferredSize(new Dimension(d,d));
		nada2.setPreferredSize(new Dimension(d,d));
		nada3.setPreferredSize(new Dimension(d,d));
		nada4.setPreferredSize(new Dimension(d,d));
		nada5.setPreferredSize(new Dimension(d,d));
		nada6.setPreferredSize(new Dimension(d,d));
		nada7.setPreferredSize(new Dimension(d,d));
		nada8.setPreferredSize(new Dimension(d,d));
		
		nada9.setPreferredSize(new Dimension(d,d));
		nada10.setPreferredSize(new Dimension(d,d));
		nada11.setPreferredSize(new Dimension(d,d));
		nada12.setPreferredSize(new Dimension(d,d));
		nada13.setPreferredSize(new Dimension(d,d));
		nada14.setPreferredSize(new Dimension(d,d));
		nada15.setPreferredSize(new Dimension(d,d));
		nada16.setPreferredSize(new Dimension(d,d));
		
		nada17.setPreferredSize(new Dimension(d,d));
		nada18.setPreferredSize(new Dimension(d,d));
		nada19.setPreferredSize(new Dimension(d,d));
		nada20.setPreferredSize(new Dimension(d,d));
		nada21.setPreferredSize(new Dimension(d,d));
		nada22.setPreferredSize(new Dimension(d,d));
		nada23.setPreferredSize(new Dimension(d,d));
		nada24.setPreferredSize(new Dimension(d,d));
		
		
		nada25.setPreferredSize(new Dimension(d,d));
		nada26.setPreferredSize(new Dimension(d,d));
		nada27.setPreferredSize(new Dimension(d,d));
		nada28.setPreferredSize(new Dimension(d,d));
		nada29.setPreferredSize(new Dimension(d,d));
		nada30.setPreferredSize(new Dimension(d,d));
		nada31.setPreferredSize(new Dimension(d,d));
		nada32.setPreferredSize(new Dimension(d,d));
		
		
		nada.setBackground(new Color(0,0,0));
		nada2.setBackground(new Color(250,250,250));
		nada3.setBackground(new Color(0,0,0));
		nada4.setBackground(new Color(250,250,250));
		nada5.setBackground(new Color(0,0,0));
		nada6.setBackground(new Color(250,250,250));
		nada7.setBackground(new Color(0,0,0));
		nada8.setBackground(new Color(250,250,250));
		
		nada9.setBackground(new Color(250,250,250));
		nada10.setBackground(new Color(0,0,0));
		nada11.setBackground(new Color(250,250,250));
		nada12.setBackground(new Color(0,0,0));
		nada13.setBackground(new Color(250,250,250));
		nada14.setBackground(new Color(0,0,0));
		nada15.setBackground(new Color(250,250,250));
		nada16.setBackground(new Color(0,0,0));
		
		nada17.setBackground(new Color(0,0,0));
		nada18.setBackground(new Color(250,250,250));
		nada19.setBackground(new Color(0,0,0));
		nada20.setBackground(new Color(250,250,250));
		nada21.setBackground(new Color(0,0,0));
		nada22.setBackground(new Color(250,250,250));
		nada23.setBackground(new Color(0,0,0));
		nada24.setBackground(new Color(250,250,250));
		
		nada25.setBackground(new Color(250,250,250));
		nada26.setBackground(new Color(0,0,0));
		nada27.setBackground(new Color(250,250,250));
		nada28.setBackground(new Color(0,0,0));
		nada29.setBackground(new Color(250,250,250));
		nada30.setBackground(new Color(0,0,0));
		nada31.setBackground(new Color(250,250,250));
		nada32.setBackground(new Color(0,0,0));
		
		
		caixa.add(torre);
		caixa.add(cavalo);
		caixa.add(bispo);
		caixa.add(rei);
		caixa.add(rainha);
		caixa.add(bispo2);
		caixa.add(cavalo2);
		caixa.add(torre2);
		
		caixa.add(peao);
		caixa.add(peao2);
		caixa.add(peao3);
		caixa.add(peao4);
		caixa.add(peao5);
		caixa.add(peao6);
		caixa.add(peao7);
		caixa.add(peao8);
		
		caixa.add(nada);
		caixa.add(nada2);
		caixa.add(nada3);
		caixa.add(nada4);
		caixa.add(nada5);
		caixa.add(nada6);
		caixa.add(nada7);
		caixa.add(nada8);
		
		caixa.add(nada9);
		caixa.add(nada10);
		caixa.add(nada11);
		caixa.add(nada12);
		caixa.add(nada13);
		caixa.add(nada14);
		caixa.add(nada15);
		caixa.add(nada16);
		
		caixa.add(nada17);
		caixa.add(nada18);
		caixa.add(nada19);
		caixa.add(nada20);
		caixa.add(nada21);
		caixa.add(nada22);
		caixa.add(nada23);
		caixa.add(nada24);
		
		caixa.add(nada25);
		caixa.add(nada26);
		caixa.add(nada27);
		caixa.add(nada28);
		caixa.add(nada29);
		caixa.add(nada30);
		caixa.add(nada31);
		caixa.add(nada32);
		
		
		ImageIcon img_rap = new ImageIcon(url+"RainhaP_B.png");
		ImageIcon img_bpp = new ImageIcon(url+"BispoP_B.png");
		ImageIcon img_rip = new ImageIcon(url+"ReiP_B.png");
		ImageIcon img_cvp = new ImageIcon(url+"CavaloP_B.png");
		ImageIcon img_trp = new ImageIcon(url+"TorreP_B.png");
		ImageIcon img_pep = new ImageIcon(url+"PeaoP_B.png");
		
		
		JButton rainhap = new JButton(img_rap);
		JButton cavalop = new JButton(img_cvp);
		JButton reip = new JButton(img_rip);
		JButton bispop = new JButton(img_bpp);
		JButton torrep = new JButton(img_trp);
		
		JButton bispo2p = new JButton(img_bpp);
		JButton torre2p = new JButton(img_trp);
		JButton cavalo2p = new JButton(img_cvp);
		
		JButton peaop = new JButton(img_pep);
		JButton peao2p = new JButton(img_pep);
		JButton peao3p = new JButton(img_pep);
		JButton peao4p = new JButton(img_pep);
		JButton peao5p = new JButton(img_pep);
		JButton peao6p = new JButton(img_pep);
		JButton peao7p = new JButton(img_pep);
		JButton peao8p = new JButton(img_pep);
		
		rainhap.setPreferredSize(new Dimension(d,d));
		cavalop.setPreferredSize(new Dimension(d,d));
		cavalo2p.setPreferredSize(new Dimension(d,d));
		peaop.setPreferredSize(new Dimension(d,d));
		reip.setPreferredSize(new Dimension(d,d));
		bispop.setPreferredSize(new Dimension(d,d));
		torrep.setPreferredSize(new Dimension(d,d));
		bispo2p.setPreferredSize(new Dimension(d,d));
		torre2p.setPreferredSize(new Dimension(d,d));
		peao2p.setPreferredSize(new Dimension(d,d));
		peao3p.setPreferredSize(new Dimension(d,d));
		peao4p.setPreferredSize(new Dimension(d,d));
		peao5p.setPreferredSize(new Dimension(d,d));
		peao6p.setPreferredSize(new Dimension(d,d));
		peao7p.setPreferredSize(new Dimension(d,d));
		peao8p.setPreferredSize(new Dimension(d,d));
		
		torrep.setBackground(new Color(250,250,250));
		cavalop.setBackground(new Color(0,0,0));
		bispop.setBackground(new Color(250,250,250));
		reip.setBackground(new Color(0,0,0));
		rainhap.setBackground(new Color(250,250,250));
		bispo2p.setBackground(new Color(0,0,0));
		cavalo2p.setBackground(new Color(250,250,250));
		torre2p.setBackground(new Color(0,0,0));
		
		peaop.setBackground(new Color(0,0,0));
		peao2p.setBackground(new Color(250,250,250));
		peao3p.setBackground(new Color(0,0,0));
		peao4p.setBackground(new Color(250,250,250));
		peao5p.setBackground(new Color(0,0,0));
		peao6p.setBackground(new Color(250,250,250));
		peao7p.setBackground(new Color(0,0,0));
		peao8p.setBackground(new Color(250,250,250));
		
		caixa.add(peaop);
		caixa.add(peao2p);
		caixa.add(peao3p);
		caixa.add(peao4p);
		caixa.add(peao5p);
		caixa.add(peao6p);
		caixa.add(peao7p);
		caixa.add(peao8p);
		
		caixa.add(torrep);
		caixa.add(cavalop);
		caixa.add(bispop);
		caixa.add(reip);
		caixa.add(rainhap);
		caixa.add(bispo2p);
		caixa.add(cavalo2p);
		caixa.add(torre2p);

		tabuleiro.add(caixa);
		tabuleiro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabuleiro.pack();
		tabuleiro.setSize(700,725);
		tabuleiro.setResizable(false);
		tabuleiro.setVisible(true);
		
		
		
		
		
	}
	

}
