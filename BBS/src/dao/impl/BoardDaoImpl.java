package dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sun.crypto.provider.RSACipher;

import dao.BoardDao;
import entity.Board;

public class BoardDaoImpl extends BaseDao implements BoardDao {

	@Override
	public Map<List, List> findBoard() {
		Map<List, List> boardMap  = new HashMap<List, List>();
		List< Board> fBoardsList = new ArrayList<Board>();
		List<Board> cBoardsList = new ArrayList<Board>();
		
//		List<Board> boardList = new ArrayList<Board>();
//		Iterator<Board> listIterator = boardList.listIterator();
		
		Board board = null;
		String sql = "select * from TBL_BOARD";
		ResultSet rs = null;
		PreparedStatement ps = null;
		
		try {
			ps = this.preStmt(sql);
			rs = ps.executeQuery();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		try {
			try {
				while (rs.next()) {
					
					board = new Board();
					board.setBoardId(rs.getInt("boardId"));
					board.setBoardName(rs.getString("boardName"));
					board.setParentId(rs.getInt("parentId"));
					
					if(rs.getInt("parentId")==0) {				
						fBoardsList.add(board);
					}
					else {
						cBoardsList.add(board);
					}
/*----------------------------------------------------------------只返回Map<Board,Board>--------------------------------------------------------------*/
//				
//				board = new Board();
//				board.setBoardId(rs.getInt("boardId"));
//				board.setBoardName(rs.getString("boardName"));
//				board.setParentId(rs.getInt("parentId"));
//				//每次取回一个子板块都要与父版块联系
//				for (Board board2 : boardMap.keySet()) {
//					//不是父板块直接下一轮循环
//					if (board2.getParentId()!=0) {
//						continue;
//					}
//					if (board2.getBoardId() == board.getParentId()) {
//						boardMap.put(board, board2);
//						break;
//					}
//				}
//				
///*----------------------------------------------------------------list线程异常--------------------------------------------------------------*/
////				while (listIterator.hasNext()) {
////					//从ArrayList取得父板块
////					
////					//Board parentsBoard = (Board) listIterator.next();
////					//联系判断
////					if (parentsBoard.getBoardId()==board.getParentId()) {
////						boardMap.put(board, parentsBoard);
////						break;
////					}
////				}
///*----------------------------------------------------------------list线程异常------------------------------------------------------------------*/
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
					
/*----------------------------------------------------------------只返回Map<Board,Board>--------------------------------------------------------------*/
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		boardMap.put(fBoardsList, cBoardsList);
		
		
		return boardMap;
	}
		

	@Override
	public Board findBoard(int boardId) {
		String sql = "select * from TBL_BOARD where boardId=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		Board board = null;
		try {
			ps = this.preStmt(sql);
			ps.setInt(1, boardId);
			rs = ps.executeQuery();
			rs.next();
			board = new Board();
			board.setBoardId(rs.getInt("boardId"));
			board.setBoardName(rs.getString("boardName"));
			board.setParentId(rs.getInt("parentId"));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		return board;
	}

}
