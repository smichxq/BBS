package biz.impl;

import java.util.List;
import java.util.Map;

import biz.BoardBiz;
import dao.impl.BoardDaoImpl;
import entity.Board;

public class BoardBizImpl extends BoardDaoImpl implements BoardBiz {
	public Map<List, List> findBoard() {
		return super.findBoard();
	}
	
	public Board findBoard(int boardId) {
		return super.findBoard(boardId);
	}

}
