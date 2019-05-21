package clazz;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class CourseForm implements TableModel {

    private String[] title = {
         "时间",  "星期一", "星期二", "星期三", "星期四", "星期五"
    };
    private String[][] data = new String[4][6];

    public CourseForm() {
    }
    public CourseForm(String[] pass) {
    	this.data[0][0]="上午1-2节";
    	this.data[1][0]="上午3-4节";
    	this.data[2][0]="下午5-6节";
    	this.data[3][0]="下午7-8节";
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 6; j++) {
                this.data[i][j] = pass[i + (j-1) * 4];
            }
        }
    }

    @Override
    public int getRowCount() {
        return 4;
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return title[columnIndex];
    }

    @Override
    public java.lang.Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return data[rowIndex][columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        data[rowIndex][columnIndex] = (String) aValue;
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
