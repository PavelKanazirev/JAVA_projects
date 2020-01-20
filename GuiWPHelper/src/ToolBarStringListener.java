public class ToolBarStringListener implements StringListener {
	private TextPanel textPanel;
	public ToolBarStringListener(TextPanel _textPanel)
	{
		textPanel = _textPanel;
	}
	@Override
	public void textEmitted(String _text) {
		textPanel.appendText(_text);
	}
}
