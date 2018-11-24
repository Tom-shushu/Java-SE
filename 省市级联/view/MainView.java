package view;

import java.awt.BorderLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

import bean.AreaInfo;
import bean.CityInfo;
import bean.ProvinceInfo;
import biz.AreaBiz;
import biz.CityBiz;
import biz.ProvinceBiz;

@SuppressWarnings("serial")
public class MainView extends JFrame {
	//声明三个下拉菜单和一个面板
	private JComboBox<ProvinceInfo> prov;
	private JComboBox<CityInfo> city;
	private JComboBox<AreaInfo> area;
	private JPanel panel;

	private int i = 0;
	
	private ProvinceBiz pb = new ProvinceBiz();
	private CityBiz cb = new CityBiz();
	private AreaBiz ab = new AreaBiz();
	public MainView() {
		setTitle("省市区级联");
		panel = new JPanel();
		prov = new JComboBox<ProvinceInfo>();
		city = new JComboBox<CityInfo>();
		area = new JComboBox<AreaInfo>();
		//将三个下拉菜单加入到面板中
		panel.add(prov);
		panel.add(city);
		panel.add(area);
		//将面板加入到窗体中,并且放到北边
		add(panel,BorderLayout.NORTH);
		
		//在页面加载时,将省的信息都加入到第一个下拉菜单中
		List<ProvinceInfo> list = pb.findAllProv();
		for (ProvinceInfo pi : list) {
			prov.addItem(pi);
		}
		
		//负责给省份选中加入事件
		prov.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				i++;
				if(i%2==0){
					i = 0;
					//首先将原来的城市清空
					city.removeAllItems();
					
					ProvinceInfo pi = (ProvinceInfo) prov.getSelectedItem();
					String provinceId = pi.getProvinceId();
					List<CityInfo> list = cb.findByProvinceId(provinceId);
					for (CityInfo ci : list) {
						city.addItem(ci);
					}
				}
				
			}
		});
		
		city.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				i++;
				if(i%2==0){
					i = 0;
					area.removeAllItems();
					CityInfo ci = (CityInfo) city.getSelectedItem();
					String cityId = ci.getCityId();
					List<AreaInfo> list = ab.findByCityId(cityId);
					for (AreaInfo ai : list) {
						area.addItem(ai);
					}
				}
			}
		});
		
		//设置窗体的大小,居中,不可更改尺寸,关闭,显示
		setBounds(0, 0, 700, 450);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new MainView();
	}
}
