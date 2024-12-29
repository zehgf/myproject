import request from '@/utils/request'

// 查询人事管理列表
export function listCopy(query) {
  return request({
    url: '/staff/copy/list',
    method: 'get',
    params: query
  })
}

// 查询人事管理详细
export function getCopy(classno) {
  return request({
    url: '/staff/copy/' + classno,
    method: 'get'
  })
}

// 新增人事管理
export function addCopy(data) {
  return request({
    url: '/staff/copy',
    method: 'post',
    data: data
  })
}

// 修改人事管理
export function updateCopy(data) {
  return request({
    url: '/staff/copy',
    method: 'put',
    data: data
  })
}

// 删除人事管理
export function delCopy(classno) {
  return request({
    url: '/staff/copy/' + classno,
    method: 'delete'
  })
}
