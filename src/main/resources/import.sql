
--IMPORTANTE A HIERARQUIA DAS TABELAS PARA NÃO DAR ERRO NA HORA DO INSERT

INSERT INTO tb_setor (descricao_Setor, centro_Custo) VALUES ('Produção', '12.411');
INSERT INTO tb_setor (descricao_Setor, centro_Custo) VALUES ('Manutenção', '12.412');
INSERT INTO tb_setor (descricao_Setor, centro_Custo) VALUES ('Administração', '12.413');
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Administração da produção', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Recebimento de sucatas', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Balança rodoviária', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Triagem de sucatas', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Carregamento de fornos', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Vazamento', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Corte de tarugos', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Homogeinização', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Resfriamento', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Embalagem', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Expedição', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Qualidade e meio ambiente', 1);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Manutenção industrial', 2);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Manutenção predial', 2);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Recursos Humanos', 3);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Compras de insumos', 3);
INSERT INTO tb_processo (descricao_processo, setor_id) VALUES ('Vendas', 3);

INSERT INTO tb_cad_Pessoa (tipo, nome, email, telefone, logradouro, numero, complemento, bairro, cidade, cep, estado, uf) VALUES ('F', 'Luciano Rodrigo de Carvalho', 'luciano@email.com', '44-988167652', 'Rua Argentino Moreschi', 62, 'Casa B', 'Residencial Moreschi', 'Maringá', '83-080-127', 'Paraná', 'PR');
INSERT INTO tb_funcionario (cpf, rg, matricula, usuario_sistema, id, processo_id) VALUES ('198.149.318-29', '29.533.398-4', '34.131', True, 1, 1);

INSERT INTO tb_cad_Pessoa (tipo, nome, email, telefone, logradouro, numero, complemento, bairro, cidade, cep, estado, uf) VALUES ('F', 'Michele Silva', 'michele@email.com', '44-1554220', 'Rua Centro', 162, 'Casa A', 'Residencial Paysandu', 'Paysandu', '83-080-000', 'Paraná', 'PR');
INSERT INTO tb_funcionario (cpf, rg, matricula, usuario_sistema, id, processo_id) VALUES ('100.112.314-13', '11.458.111-29', '34.133', False, 2, 11);

INSERT INTO tb_cad_Pessoa (tipo, nome, email, telefone, logradouro, numero, complemento, bairro, cidade, cep, estado, uf) VALUES ('F', 'Jonathas Souza', 'jonathas@email.com', '41-4575555', 'Rua das Américas', 750, 'Casa C', 'Residencial Sarandi', 'Sarandi', '44-080-000', 'Paraná', 'PR');
INSERT INTO tb_funcionario (cpf, rg, matricula, usuario_sistema, id, processo_id) VALUES ('041.444.115-45', '19.255.295-4', '34.136', True, 3, 17);

INSERT INTO tb_cad_Pessoa (tipo, nome, email, telefone, logradouro, numero, complemento, bairro, cidade, cep, estado, uf) VALUES ('F', 'Gioavana', 'giovana@email.com', '44-755888', 'Rua VX 18', 70, 'Casa D', 'Residencial Maringá', 'Maringá', '11-080-000', 'Paraná', 'PR');
INSERT INTO tb_funcionario (cpf, rg, matricula, usuario_sistema, id, processo_id) VALUES ('041.444.115-45', '19.255.295-4', '34.136', False, 4, 3);


INSERT INTO tb_cad_Pessoa (tipo, nome, email, telefone, logradouro, numero, complemento, bairro, cidade, cep, estado, uf) VALUES ('J', 'Ecoalumi', 'eco@email.com', '44-4125658', 'Rua Aluízio Nunes Costa', 540, 'Barracão A', 'Distrito Industrial', 'Maringá', '80-050-125', 'Paraná', 'PR');
INSERT INTO tb_pes_juridica (cnpj, ie, id) VALUES ('00.001.112/001-75', '114.115.147', 1);


INSERT INTO tb_un_medidas (sigla, descricao_un) VALUES ('kg', 'Quilos');
INSERT INTO tb_un_medidas (sigla, descricao_un) VALUES ('ton', 'Toneladas');
INSERT INTO tb_un_medidas (sigla, descricao_un) VALUES ('pc', 'Peça');
INSERT INTO tb_un_medidas (sigla, descricao_un) VALUES ('un', 'unidade');
INSERT INTO tb_un_medidas (sigla, descricao_un) VALUES ('l', 'Litros');
INSERT INTO tb_un_medidas (sigla, descricao_un) VALUES ('m', 'Metros');
INSERT INTO tb_un_medidas (sigla, descricao_un) VALUES ('pol', 'Polegadas');



INSERT INTO tb_gp_material (descricaoGP) VALUES ('Produto');
INSERT INTO tb_gp_material (descricaoGP) VALUES ('Sucata');
INSERT INTO tb_gp_material (descricaoGP) VALUES ('Insumos de produção');
INSERT INTO tb_gp_material (descricaoGP) VALUES ('Insumos de manutenção industrial');
INSERT INTO tb_gp_material (descricaoGP) VALUES ('Insumos de manutenção civil');

INSERT INTO tb_cad_ligas (liga, si, fe, cu, mn, mg, cr, ni, na, zn, ti, b, pb, al) VALUES (6060, 0.47, 0.28, 0.0591, 0.0604, 0.40, 0.0106, 0.00475, 0.00032, 0.0523, 0.0119, 0.00299, 0.0116, 98.6);
INSERT INTO tb_cad_ligas (liga, si, fe, cu, mn, mg, cr, ni, na, zn, ti, b, pb, al) VALUES (6063, 0.49, 0.32, 0.0591, 0.0604, 0.48, 0.0106, 0.00475, 0.00032, 0.0523, 0.0119, 0.00299, 0.0116, 98.4);
INSERT INTO tb_cad_ligas (liga, si, fe, cu, mn, mg, cr, ni, na, zn, ti, b, pb, al) VALUES (6005, 0.65, 0.32, 0.0591, 0.0604, 0.55, 0.0106, 0.00475, 0.00032, 0.0523, 0.0119, 0.00299, 0.0116, 98.4);
INSERT INTO tb_cad_ligas (liga, si, fe, cu, mn, mg, cr, ni, na, zn, ti, b, pb, al) VALUES (6351, 1.00, 0.32, 0.0591, 0.4900, 0.70, 0.0106, 0.00475, 0.00032, 0.0523, 0.0119, 0.00299, 0.0116, 98.4);

INSERT INTO tb_cad_material (descricao_material, gp_material_id, cad_unidade_id) VALUES ('Perfil de aluminio - Processo', 2, 1);
INSERT INTO tb_cad_material (descricao_material, gp_material_id, cad_unidade_id) VALUES ('Perfil de aluminio - Misto', 2, 1);
INSERT INTO tb_cad_material (descricao_material, gp_material_id, cad_unidade_id) VALUES ('GLP - Gás Liquefeito', 3, 1);
INSERT INTO tb_cad_material (descricao_material, gp_material_id, cad_unidade_id) VALUES ('CLP Controlador HO', 4, 4);
INSERT INTO tb_cad_material (descricao_material, gp_material_id, cad_unidade_id) VALUES ('Tinta branca', 5, 5);

INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 4 Pol 3 m', 1, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 4 Pol 6 m', 1, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 5 Pol 3 m', 1, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 5 Pol 6 m', 1, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 6 Pol 3 m', 1, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 6 Pol 6 m', 1, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 7 Pol 3 m', 1, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 7 Pol 6 m', 1, 1, 1);

INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 4 Pol 3 m', 2, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 4 Pol 6 m', 2, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 5 Pol 3 m', 2, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 5 Pol 6 m', 2, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 6 Pol 3 m', 2, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 6 Pol 6 m', 2, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 7 Pol 3 m', 2, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 7 Pol 6 m', 2, 1, 1);

INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 4 Pol 3 m', 3, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 4 Pol 6 m', 3, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 5 Pol 3 m', 3, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 5 Pol 6 m', 3, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 6 Pol 3 m', 3, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 6 Pol 6 m', 3, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 7 Pol 3 m', 3, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 7 Pol 6 m', 3, 1, 1);

INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 4 Pol 3 m', 4, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 4 Pol 6 m', 4, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 5 Pol 3 m', 4, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 5 Pol 6 m', 4, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 6 Pol 3 m', 4, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 6 Pol 6 m', 4, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 7 Pol 3 m', 4, 1, 1);
INSERT INTO tb_produto (descricao_prod, liga_id, cad_unidade_id, gp_material_id) VALUES ('Tarugo de alumínio - 7 Pol 6 m', 4, 1, 1);

INSERT INTO tb_maquina (descricao, modelo, capacidade, fabricante, ano_fabricacao, ano_aquisicao) VALUES ('FORNO 01', 'BASCULANTE', '10 TON', 'CHINA', 2000, 2005)
